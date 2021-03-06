USE [zmiana_io]
GO
SET IDENTITY_INSERT [dbo].[performance] ON

INSERT [dbo].[performance] ([id], [hallid], [movieid], [adsduration], [performancetype])
VALUES (1, 3, 1, 60000000000, N'VR')
INSERT [dbo].[performance] ([id], [hallid], [movieid], [adsduration], [performancetype])
VALUES (2, 1, 14, 60000000000, N'2D')
INSERT [dbo].[performance] ([id], [hallid], [movieid], [adsduration], [performancetype])
VALUES (3, 1, 22, 60000000000, N'3D')
INSERT [dbo].[performance] ([id], [hallid], [movieid], [adsduration], [performancetype])
VALUES (4, 2, 4, 60000000000, N'2D')
INSERT [dbo].[performance] ([id], [hallid], [movieid], [adsduration], [performancetype])
VALUES (5, 4, 18, 60000000000, N'2D')
SET IDENTITY_INSERT [dbo].[performance] OFF
SET IDENTITY_INSERT [dbo].[timetable] ON

INSERT [dbo].[timetable] ([id], [performanceid], [performancedate])
VALUES (1, 1, CAST(N'2019-12-17T18:20:00.0000000' AS DATETIME2))
INSERT [dbo].[timetable] ([id], [performanceid], [performancedate])
VALUES (2, 2, CAST(N'2005-04-02T21:37:00.0000000' AS DATETIME2))
INSERT [dbo].[timetable] ([id], [performanceid], [performancedate])
VALUES (3, 3, CAST(N'2019-12-04T15:20:00.0000000' AS DATETIME2))
INSERT [dbo].[timetable] ([id], [performanceid], [performancedate])
VALUES (4, 4, CAST(N'2019-12-28T22:45:00.0000000' AS DATETIME2))
INSERT [dbo].[timetable] ([id], [performanceid], [performancedate])
VALUES (5, 5, CAST(N'2019-11-25T06:30:00.0000000' AS DATETIME2))
SET IDENTITY_INSERT [dbo].[timetable] OFF
