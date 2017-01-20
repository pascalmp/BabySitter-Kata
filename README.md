# BabySitter-Kata

Babysitter Kata (from https://gist.github.com/jameskbride/5482722)

Background
----------
This kata simulates a babysitter working and getting paid for one night.  The rules are pretty straight forward:

The babysitter
- starts no earlier than 5:00PM
- leaves no later than 4:00AM
- gets paid $12/hour from start-time to bedtime
- gets paid $8/hour from bedtime to midnight
- gets paid $16/hour from midnight to end of job
- gets paid for full hours (no fractional hours)


Feature:
As a babysitter
In order to get paid for 1 night of work
I want to calculate my nightly charge


Assumptions
-----------
Possible Scenarios graphic:

ST:StartTime;
MN:MidNight;
BT:BedTime;
ET:EndTime;

Shift minus BedTime:

|ST------------------|MN------------|ET

PayRate per SubShift:

|ST---$12---|BT--$8--|MN---$16------|ET

|ST---$12------------|MN--$16-|BT---|ET

WHAT WE KNOW:
-------------
BabySitter earns:

$12 from ST to BT;
$8  from BT to MN;
$16 from MN to ET;

ST Can be anytime between 5pm and 4am;but
ST cannot be the same as ET;

ET can be anytime between 5pm and 4am;but
ET cannot be the same as ST;

BT can be anytime from 5pm to 4am;

MN is the only fixed time (Obviously);

In brief, BabySitter in order to be paid, the time worked has to start not earlier than 5pm and not later than 4am.