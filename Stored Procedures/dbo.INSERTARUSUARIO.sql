SET QUOTED_IDENTIFIER ON
GO
SET ANSI_NULLS ON
GO
CREATE PROCEDURE [dbo].[INSERTARUSUARIO]
@NOMUS VARCHAR(50),
@FECINTRUS DATETIME,
@ESTUS CHAR(1),
@IDPER INT
AS
BEGIN

INSERT INTO
USUARIO
(NOMUS,FECINTRUS,ESTUS,IDPER)
VALUES
(@NOMUS,@FECINTRUS,@ESTUS,@IDPER)
END
GO
