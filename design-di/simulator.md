
Simulator Design

# Responsibilities Driven Design



################################################
# Capabilitiy Analysis - Dos & Donts
################################################
The assembly of the car _is determined by_ the model.

    The models are as follows
    * mini
        A mini will only have two seats with a max speed of 50 km/hr
    * maxi
        A maxi will only have four seats with a max speed of 100 km/hr

The cost of the car _is determined by_ the unit costs of the parts

    The parts are
    * wheels
    * seats
    * doors
    * steering
    * engine


The speed of the car _is determined by_ engine size
    
    The engine size is fixed 1000cc

The color of the car _is determined by_ model

    The colors are red for mini, blue for maxi


################################################
# Design 
###############################################

nouns
* engine

collective nouns
* wheels
* seats
* breaks
* passengers
 

associations
# is a kind of...

Messages with Responses
* start up the engine (started)
* stop the car (stationary)
* turn left/right (left/right)
* drive straight 
* reverse car 
* park (stationary)
* slow down 
* indicate (alerting)

State Enforcement
* Cannot park moving car
* Cannot brake and drive




