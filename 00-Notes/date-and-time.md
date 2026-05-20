# Java - Date and Time

In Java, working with **date and time** can be done using the modern Java Time API introduced in Java 8:

```java
java.time
```

The most commonly used classes are:

| Class               | Purpose                  |
| ------------------- | ------------------------ |
| `LocalDate`         | Date only                |
| `LocalTime`         | Time only                |
| `LocalDateTime`     | Date + time              |
| `DateTimeFormatter` | Formatting dates/times   |
| `Period`            | Difference between dates |
| `Duration`          | Difference between times |

---

# 1. Current Date

```java id="y9szjx"
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);
    }
}
```

Example Output:

```text id="4mdq4z"
2026-05-19
```

---

# 2. Current Time

```java id="wjtw4q"
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println(time);
    }
}
```

Example Output:

```text id="jvwz3f"
14:35:12.123
```

---

# 3. Current Date and Time

```java id="jymbz2"
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
    }
}
```

Example Output:

```text id="ff3j4l"
2026-05-19T14:35:12.123
```

---

# 4. Creating Custom Dates

```java id="hry3s7"
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(2005, 2, 27);

        System.out.println(birthday);
    }
}
```

---

# 5. Creating Custom Times

```java id="jlwmfh"
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalTime meeting = LocalTime.of(9, 30);

        System.out.println(meeting);
    }
}
```

---

# 6. Formatting Date and Time

By default, Java uses ISO format.

To customize formatting:

```java id="8i2g7d"
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        String formatted = now.format(format);

        System.out.println(formatted);
    }
}
```

Example Output:

```text id="0ap4qx"
19/05/2026 14:35
```

---

# Common Formatting Symbols

| Symbol | Meaning    |
| ------ | ---------- |
| `dd`   | Day        |
| `MM`   | Month      |
| `yyyy` | Year       |
| `HH`   | Hour (24h) |
| `hh`   | Hour (12h) |
| `mm`   | Minutes    |
| `ss`   | Seconds    |

---

## Simple DateFormat Format Codes

To specify the time format, use a time pattern string. In this pattern, all ASCII letters are reserved as pattern letters, which are defined as the following −

### Character Description Example

G Era designator AD
y Year in four digits 2001
M Month in year July or 07
d Day in month 10
h Hour in A.M./P.M. (1~12) 12
H Hour in day (0~23) 22
m Minute in hour 30
s Second in minute 55
S Millisecond 234
E Day in week Tuesday
D Day in year 360
F Day of week in month 2 (second Wed. in July)
w Week in year 40
W Week in month 1
a A.M./P.M. marker PM
k Hour in day (1~24) 24
K Hour in A.M./P.M. (0~11) 10
z Time zone Eastern Standard Time
' Escape for text Delimiter
" Single quote `

---

# 7. Adding Dates

```java id="8m4g1k"
LocalDate today = LocalDate.now();

LocalDate future = today.plusDays(10);

System.out.println(future);
```

---

# 8. Subtracting Dates

```java id="83czym"
LocalDate today = LocalDate.now();

LocalDate past = today.minusMonths(2);

System.out.println(past);
```

---

# 9. Comparing Dates

```java id="t8r90f"
LocalDate d1 = LocalDate.of(2026, 1, 1);
LocalDate d2 = LocalDate.of(2026, 5, 1);

System.out.println(d1.isBefore(d2));
```

Output:

```text id="w2hz0o"
true
```

---

# 10. Period Between Dates

```java id="m81jlwm"
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate birth = LocalDate.of(2005, 2, 27);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birth, today);

        System.out.println(age.getYears());
    }
}
```

---

# 11. Duration Between Times

```java id="g02qte"
import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 30);

        Duration duration = Duration.between(start, end);

        System.out.println(duration.toMinutes());
    }
}
```

Output:

```text id="vg0sdo"
150
```

---

# Old Date API (Legacy)

Older Java code may use:

```java
Date
Calendar
SimpleDateFormat
```

But modern Java prefers:

```java
java.time
```

because it is cleaner and safer.

---

# Real Example

```java id="ejvjlwm"
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm");

        System.out.println(now.format(formatter));
    }
}
```

Example Output:

```text id="1fgv7f"
Tuesday, 19 May 2026 14:35
```

---

# Easy Way to Remember

| Need                | Class               |
| ------------------- | ------------------- |
| Date only           | `LocalDate`         |
| Time only           | `LocalTime`         |
| Date + Time         | `LocalDateTime`     |
| Format output       | `DateTimeFormatter` |
| Difference in dates | `Period`            |
| Difference in time  | `Duration`          |
