# Capsule

On startup, the Java application prompts the administrator for the hotel's capacity. The capacity determines how many rooms are available.
The administrator may book a guest in an unoccupied numbered room.
The administrator may check out a guest from an occupied room.
The administrator may view guests and their room numbers in groups of 10.
Example:

Welcome to Hotel Hotel

========================

Enter the number of rooms available: "81"

There are 81 rooms available!

Guest menu

===================

1.Check in

2. Check out

3. View Guests

4. Exit

Choose an option [1-4]:

----------------------------------------------

Guest Check In
==============
Guest Name: james smith
Capsule #[1-100]: 23

Error :(
room #23 is occupied.

rooms #[1-100]: 21

Success :)
James Smith is booked in capsule #21.
Guest Check Out
===============
room #[1-100]: 71

Error :(
room #71 is unoccupied.

View Guests
===========
rooms #[1-100]: 21
Success :)
James Smith checked out from capsule #21
rooms: Guest
21: James Smith
22: Amy Smith
23: [unoccupied]
24: [unoccupied]
25: Steph curry
26: [unoccupied]
27: [unoccupied]
28: [unoccupied]
29: Penny wise
30: johnny bravo
31: [unoccupied]

room #[1-100]: 21
Exit
====
Are you sure you want to exit?
All data will be lost.
Exit [y/n]: y
