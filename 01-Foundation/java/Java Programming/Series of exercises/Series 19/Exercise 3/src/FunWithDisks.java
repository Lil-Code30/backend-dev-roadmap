
import java.util.Random;

// Try to solve those little brain-teasers! It's not allowed to create
// new sub-classes (even anonymous) of the 5 Disk classes, nor to modify
// their existing implementation (nor to use reflection or similar black-magic).

public class FunWithDisks {

    static final int NUMBER_OF_EXPERIMENTS = 1_000;
    static final Random RND = new Random();

    // Returns a random index for reading a byte
    static byte rndByte() {
        return (byte)(RND.nextInt());
    }

    // Simulate random reading/writing until a failure happens, then
    // returns the number of reading/writing operations
    static long timeToFailure(Disk d) {
        long k = 0;
        boolean isSane = true;
        while (isSane) {
            k++;
            int index = RND.nextInt(d.capacity());
            boolean isReadOperation = RND.nextBoolean();
            try {
                if (isReadOperation)
                    d.readAt(index);
                else
                    d.writeAt(index, rndByte());
            } catch(DeadDiskException e) {
                isSane = false;
            }
        }
        return k;
    }

    // Returns
    static SingleDiskDevice[] mysteriousDisks(int nDisks) {
        SingleDiskDevice[] t = new SingleDiskDevice[nDisks];
        for (int i=0; i < nDisks; i++) {
            t[i] = new SingleDiskDevice();
        }
        if (nDisks > 1) {
            // Oops - there are multiple aliases in the components!
            t[1] = t[0];
        }
        return t;
    }

    static DiskDevice strangeCapacityDisk() {
        /* Create a disk configuration that reproduces the problem in the brainteasers method */
    }

    static DiskDevice badDisk() {
        /* Create a disk configuration that reproduces the problem in the brainteasers method */
    }

    static void brainteasers() {
        DiskDevice raid0 = new Raid0(mysteriousDisks(5));
        DiskDevice raid1 = new Raid1(mysteriousDisks(5));
        /* Question 1: Is there any problem with this raid0 and with this raid1? */

        DiskDevice strangeCapacityDisk = strangeCapacityDisk();
        int rest = strangeCapacityDisk.capacity() % SingleDiskDevice.SINGLE_DISK_CAPACITY;
        if (rest != 0) {
            System.out.println("Non-zero rest (eg 112): " + rest);
        }

        DiskDevice badDisk = badDisk();
        System.out.println("Now we face a surprising failure...");
        try {
            badDisk.writeAt(0, (byte)0);
            System.out.println("That's not surprising at all...");
        } catch(DeadDiskException | InvalidIndexException | NullPointerException e) {
            System.out.println("Not surprising enough...");
        } catch(Throwable e) {
            System.out.println("That's the bad surprise! \n" + e);                // !!!!! b3
        }
    }

    public static void main(String[] args) {
        brainteasers();
    }

}

