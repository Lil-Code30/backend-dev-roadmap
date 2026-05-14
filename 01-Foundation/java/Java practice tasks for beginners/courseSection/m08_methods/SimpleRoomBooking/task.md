<div class="hint" title="Practice topics">
  <i style="padding-left: 40px;">method with return value and params</i>
</div>

Complete the method called `simpleRoomBook()` that will take four arguments and returns a boolean about if the room can be booked for that given day.

The method is already called in the main method with arguments.

    The arguments in order are:

    - `boolean` `isAvailable`
        - if the isAvailable value is true continue to check the date,
        but if the value is false no rooms are available so there is no need to compare with the date
    - `int` `month`
    - `int` `day`
    - `int` `year`

    The restrictions for booking a room include:

    - There is only open dates in the year 2018.
    - All rooms are booked between 7/1/2018(mm/dd/yy) - 7/8/2018(mm/dd/yy) -> both the dates are inclusive

    Examples:

      simpleRoomBook(false,2,1,2018) -> false
      simpleRoomBook(true,2,1,2018) -> true
      simpleRoomBook(true,2,1,2022) -> false
      simpleRoomBook(true,7,1,2018) -> false

<div class="hint">
  <i style="padding-left: 40px;">return true only when  available is true and year is 2018. Also make sure that when month is 7, day is more than 7. Task can be solved many different ways</i>
</div>
