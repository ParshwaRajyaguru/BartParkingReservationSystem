package com.bartparkingdb.bartparkingdb.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class ConsumerRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class ConsumerRowMapper implements RowMapper<Consumer> {
        @Override
        public Consumer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Consumer consumer = new Consumer();
            consumer.setConsumerID(rs.getInt("consumerID"));
            consumer.setConsumerName(rs.getString("consumerName"));
            consumer.setEmailAddress(rs.getString("emailAddress"));
            consumer.setPassword(rs.getString("password"));
            return consumer;
        }
    }


    public List<Consumer> findAllConsumers() {
        return jdbcTemplate.query("select * from consumer",
                new ConsumerRepository.ConsumerRowMapper());
    }


    public int insert(Consumer consumer) {
        return jdbcTemplate.update("insert into consumer " +
                "(consumerID, consumerName, emailAddress, password) " +
                "values(?, ?, ?, ?)",
                new Object[] { consumer.getConsumerID(), consumer.getConsumerName(),
                consumer.getEmailAddress(), consumer.getPassword() });
    }
}
