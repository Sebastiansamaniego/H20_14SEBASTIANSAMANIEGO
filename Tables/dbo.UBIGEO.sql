CREATE TABLE [dbo].[UBIGEO]
(
[IDUBIG] [int] NOT NULL,
[PROUBIG] [varchar] (20) COLLATE Modern_Spanish_CI_AS NOT NULL,
[DISTUBIG] [varchar] (20) COLLATE Modern_Spanish_CI_AS NOT NULL
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[UBIGEO] ADD CONSTRAINT [UBIGEO_pk] PRIMARY KEY CLUSTERED  ([IDUBIG]) ON [PRIMARY]
GO
