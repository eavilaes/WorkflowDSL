CREATE TABLE Selectapizza (
	id INT AUTO_INCREMENT,
	PRIMARY KEY (id)
);
CREATE TABLE Fillpersonalinfo (
	id INT AUTO_INCREMENT,
	Name VARCHAR,
	Address VARCHAR,
	CreditCard VARCHAR,
	PRIMARY KEY (id)
);
CREATE TABLE Satisfactionquestionnaire (
	id INT AUTO_INCREMENT,
	Satisfactiondegree VARCHAR,
	PRIMARY KEY (id)
);
CREATE TABLE UploadDocuments (
	id INT AUTO_INCREMENT,
	PRIMARY KEY (id)
);
