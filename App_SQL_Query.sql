CREATE DATABASE poc;

CREATE TABLE poc.cartitem (
itemId BIGINT AUTO_INCREMENT PRIMARY KEY,
cartId BIGINT NOT NULL,
quantity BIGINT NOT NULL,
subTotal DOUBLE PRECISION NOT NULL,
productId BIGINT NOT NULL,
FOREIGN KEY (`productId`) REFERENCES `product` (`productId`)
);




