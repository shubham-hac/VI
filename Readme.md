
Class Flight:
Attributes:

flightId (int)
flightNumber (String)
destination (String)
passengers (List of Passenger objects)
Class Passenger:
Attributes:

passengerId (int)
passengerName (String)
seatNumber (String)

Methods in Flight Class:
getPassengerNames()

This method retrieves and returns a sorted list of passenger names on a flight. It takes two arguments: a list of flight objects and flightId. If no flight is found, print "Flight Not Found".
getFlightsByDestination()

This method retrieves all flights going to a specific destination and returns a list of their flight numbers. It takes two arguments: a list of flight objects and the destination. If no flights are found, print "No Flights Found".
Sample Input 1:
2
301
Flight001
New York
2
401
John Doe
12A
402
Jane Doe
12B
302
Flight002
Los Angeles
1
403
Alice Smith
14C
301
New York
Sample Output 1:
Jane Doe
John Doe
Flight001
Sample Input 2:
1
303
Flight003
Chicago
1
404
Bob Brown
16D
304
Miami
Sample Output 2:
Flight Not Found
No Flights Found
