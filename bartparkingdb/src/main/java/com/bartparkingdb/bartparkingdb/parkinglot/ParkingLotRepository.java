package com.bartparkingdb.bartparkingdb.parkinglot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class ParkingLotRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    class ParkingLotRowMapper implements RowMapper<ParkingLot> {
        @Override
        public ParkingLot mapRow(ResultSet rs, int rowNum) throws SQLException {
            ParkingLot parkingLot = new ParkingLot();
            parkingLot.setParkinglotID(rs.getInt("parkinglotID"));
            parkingLot.setParkinglotName(rs.getString("parkinglotName"));
            parkingLot.setCreatedDate(rs.getString("createdDate"));
            return parkingLot;
        }
    }

    public List<ParkingLot> findAllParkingLots() {
        return jdbcTemplate.query("select * from parkinglot",
                new ParkingLotRepository.ParkingLotRowMapper());
    }
}
