// 1. Make Mclain Proud

// You have a 3-gallon and a 5-gallon jug that you can fill from a fountain of water.
// The problem is to fill one of the jugs with exactly 4 gallons of water. How do you do it?

// Fill the 5 jug, pour into 3 jug leaving you with 2 gallons in the 5 jug. Empty the 3 jug. Pour the 2 gallons from the 5 jug into the 3 jug. Refill the 5 jug. Fill the remainder of the 3 jug (1 gallon) leaving you withj 5-1 = 4 gallons in the 5 jug.

// ////////////////////////////////


// 2. Grandma's Cake

// You are on your way to visit your Grandma, who lives at the end of the valley. It’s her anniversary,
// and you want to give her the cakes you’ve made. Between your house and her house, you have to cross 
// 5 bridges, and as it goes in the land of make believe, there is a troll under every bridge! Each troll, 
// quite rightly, insists that you pay a troll toll. Before you can cross their bridge, you have to give
// them half of the cakes you are carrying, but as they are kind trolls, they each give you back a single cake.

// How many cakes do you have to leave home with to make sure that you arrive at Grandma’s with exactly 2 cakes?

// Trolls are doing: cake / 2 + 1. We need to end up with 2. Inverse operations in the reverse order tells us to subtract 1, then multiply by 2. 2 - 1 = 1 * 2 = 2. So it does not matter how many trolls we visit, if we start with 2 cakes we will lose 1 (half of 2 is 1) and then they give us 1 leaving us with 2.


// ////////////////////////////////


// 3. The Three Light Bulbs

// A windowless room contains three identical light fixtures, each containing an identical light bulb or light globe. 
// Each light is connected to one of three switches outside of the room. Each bulb is switched off at present. 
// You are outside the room, and the door is closed. Before opening the door you may play around with the light switches
// as many times as you like. But once you've opened the door, you may no longer touch a switch. After this, you go into 
// the room and examine the lights. How can you tell which switch goes to which light?

// Switch the left and middle switches on and wait 5+ minutes depending on if they are incandescent bulbs or longer for more efficient LED bulbs. Then, switch the middle one off. Open the door, and the light that is on is the left switch, the light that is off but hot to the touch is the middle switch, and the light that is off and room temperature is the third switch.


// ////////////////////////////////

// Add two numbers without using the addition operator (this one requires coding)

function fakeAdd(intOne, intTwo){
    return intOne - (-1 * intTwo);
}

console.log(fakeAdd(13, 11));
console.log(fakeAdd(13, -11));
console.log(fakeAdd(-13, -11));
console.log(fakeAdd(-13, 11));