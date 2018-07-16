package com.bartparkingdb.bartparkingdb.parkingslot;

import com.bartparkingdb.bartparkingdb.parkinglot.ParkingLot;
import com.bartparkingdb.bartparkingdb.parkinglot.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class ParkingSlotRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    class ParkingSlotRowMapper implements RowMapper<ParkingSlot> {
        @Override
        public ParkingSlot mapRow(ResultSet rs, int rowNum) throws SQLException {
            ParkingSlot parkingSlot = new ParkingSlot();
            parkingSlot.setParkingSlotID(rs.getInt("parkingSlotID"));
            parkingSlot.setParkingSlotNumber(rs.getInt("parkingSlotNumber"));
            parkingSlot.setAllocated(rs.getBoolean("Allocated"));
            parkingSlot.setConsumerID(rs.getInt("consumerID"));
            parkingSlot.setParkingLotID(rs.getInt("parkingLotID"));
            return parkingSlot;
        }
    }

    public List<ParkingSlot> findAllParkingLots(int parkinglotId) {
        return jdbcTemplate.query("select * from parkingslot where parkingLotID = ? and Allocated = ?",
                new Object[] { parkinglotId, false },
                new ParkingSlotRepository.ParkingSlotRowMapper());
    }

    public int reservedParkingSlot(ParkingSlot parkingSlot) {
        return jdbcTemplate.update("update parkingslot set Allocated = ? "
                        + " where parkingSlotID = ?",
                new Object[] { "True", parkingSlot.getParkingSlotID() });
    }

    public int reservedParkingSlotById(int parkinglotId, int parkingslotId) {
        return jdbcTemplate.update("update parkingslot set Allocated = ? "
                        + " where parkingSlotID = ? and parkingLotID = ?",
                new Object[] { "True",  parkingslotId, parkinglotId });
    }
}
