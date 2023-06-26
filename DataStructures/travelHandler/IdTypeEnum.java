public enum IdTypeEnum {
    DNI(1),
    PASSPORT(2);

    private int idType;

    IdTypeEnum(int idType) {
        this.idType = idType;
    }

    public int getIdType() {
        return idType;
    }

    public static IdTypeEnum fromIdType(int idType) {
        for (IdTypeEnum idTypeEnum : IdTypeEnum.values()) {
            if (idTypeEnum.getIdType() == idType) {
                return idTypeEnum;
            }
        }
        return null;
    }
}
