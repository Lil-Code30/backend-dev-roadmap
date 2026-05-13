
// A Raid0 uses a group of small disks to simulate a larger one. This is how
// the memory cells should be dispatched among the members
// as follows (example given for a Raid0 with 3 disks)
//   {00,03,06,09,12}  ← member 0
//   {01,04,07,10,13}  ← member 1
//   {02,05,08,11,14}  ← member 2
// As soon as any member faces a read/write error, the whole Raid0 must be
// considered as definitely broken (i.e. every subsequent read/write will throw
// a DeadDiskException.

public class Raid0 extends Raid {
    /* Implement the Raid0 class based on existing classes */
}

