--DROP TABLE IF EXISTS attempts;
	CREATE TABLE IF NOT EXISTS attempts (
	  uuid VARCHAR(250) PRIMARY KEY,
	  user_id VARCHAR(250) NOT NULL,
	  activity_id VARCHAR(250) NOT NULL,
	  grade INT DEFAULT NULL
	);

--DROP TABLE IF EXISTS activity_stats;
    CREATE TABLE IF NOT EXISTS activity_stats (
      activity_id VARCHAR(250) NOT NULL,
      user_id VARCHAR(250) NOT NULL,
      attempts_number INT DEFAULT 0,
      accumulated_grade INT DEFAULT 0,
      average_grade INT DEFAULT 0,
      manual TINYINT(1) DEFAULT 0,
      comment VARCHAR(250),
      PRIMARY KEY (activity_id, user_id)
    );