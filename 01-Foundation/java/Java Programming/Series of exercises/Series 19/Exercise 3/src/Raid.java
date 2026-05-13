public abstract class Raid extends DiskDevice {
    protected final DiskDevice[] members;

    // We assume that every member has the same capacity
    protected final int commonMemberCapacity;

    protected Raid(DiskDevice[] members) {
        this.members = members;
        int c = 0;
        if (members.length > 0) {
            c = members[0].capacity();
            for (DiskDevice d: members)
                c = Math.min(c, d.capacity());
        }
        this.commonMemberCapacity = c;
    }
}
