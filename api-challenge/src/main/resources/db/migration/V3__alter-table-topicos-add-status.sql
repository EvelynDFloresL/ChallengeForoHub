ALTER TABLE topicos ADD COLUMN activo BOOLEAN;
UPDATE topicos SET activo = TRUE;