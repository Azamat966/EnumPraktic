public enum Month {
    SENTYABR(31),
    OKTYABR(30),
    NOYABR(29),
    APREL(28),
    MAY(33),
    IYUN(30),
    IYUL(28),
    AVGUST(30),
    DECABR(31),
    YANVAR(31),
    FEVRAL(31),
    MART(31),
    ;

    int days;

    public int getDays() {
        return days;

    }

    Month(int days) {
        this.days = days;
    }
}

