
#include "Arduino.h"        //includes the library Arduino.h
#include "SoftwareSerial.h" //Includes the library SoftwareSerial.h
//Used for defining static variables
enum {
	//rate of trnsmission
	BAUND_RATE = 9600,
};
class MyBPMNClass {
	void send_position();     
	void drive();     
	void sensing();     
	void select_destination();     
	void turn_on_the_car();     
	void leave();     
	void pay();     
	void park();     
	void park_assignement();     
	void check_driver_position();     
	void find_a_parking_spot_to_assign();     
}