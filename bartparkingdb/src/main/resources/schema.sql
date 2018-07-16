CREATE TABLE consumer
(
    consumerID INTEGER(5) NOT NULL AUTO_INCREMENT,
    consumerName VARCHAR(20),
    emailAddress VARCHAR(50),
    passward VARCHAR(15),
    PRIMARY KEY (consumerID)
);


CREATE TABLE parkinglot
(
    parkinglotID INTEGER(5) NOT NULL AUTO_INCREMENT,
    parkinglotName VARCHAR(20),
    createdDate DATETIME,
    PRIMARY KEY (parkinglotID)
);



CREATE TABLE parkingslot
(
    parkingSlotID INTEGER(5) NOT NULL AUTO_INCREMENT,
    parkingSlotNumber INTEGER(5),
    Allocated BOOLEAN DEFAULT FALSE,
    consumerID INTEGER(5) REFERENCES consumer(consumerID),
    parkingLotID INTEGER(5) REFERENCES parkinglot(parkinglotID),
    PRIMARY KEY (parkingSlotID)
);

