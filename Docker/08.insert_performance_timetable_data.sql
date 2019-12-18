
use IO;

SET IDENTITY_INSERT Performance ON
INSERT INTO Performance (Id, HallId, MovieId, PerformanceType, AdsDuration) VALUES (1, 3, 1, 'VR', 60000000000)
, (2, 1, 14, '2D', 60000000000)
, (3, 1, 22, '3D', 60000000000)
, (4, 2, 4, '2D', 60000000000)
, (5, 4, 18, '2D', 60000000000);

SET IDENTITY_INSERT Performance OFF
PRINT 'Inserted Performance';
SET IDENTITY_INSERT TimeTable ON

INSERT INTO TimeTable (Id, PerformanceId, PerformanceDate) VALUES (1, 1, '2019-12-17 18:20:00.000'),
 (2, 2, '2005-04-02 21:37:00.000'),
 (3, 3, '2019-12-04 15:20:00.000'),
 (4, 4, '2019-12-28 22:45:00.000'),
 (5, 5, '2019-11-25 06:30:00.000');
 SET IDENTITY_INSERT TimeTable OFF
 PRINT 'Inserted timeTable';





