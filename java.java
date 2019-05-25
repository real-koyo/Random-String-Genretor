var NumberOfWords = 62

var words = new BuildArray(NumberOfWords)

// Use the following variables to 
// define your random words:
words[1] = "a"
words[2] = "b"
words[3] = "c"
words[4] = "d"
words[5] = "e"
words[6] = "f"
words[7] = "g"
words[8] = "h"
words[9] = "i"
words[10] = "j"
words[11] = "k"
words[12] = "l"
words[13] = "m"
words[14] = "n"
words[15] = "o"
words[16] = "p"
words[17] = "q"
words[18] = "r"
words[19] = "s"
words[20] = "t"
words[21] = "u"
words[22] = "v"
words[23] = "w"
words[24] = "x"
words[25] = "y"
words[26] = "z"
words[27] = "A"
words[28] = "B"
words[29] = "C"
words[30] = "D"
words[31] = "E"
words[32] = "F"
words[33] = "G"
words[34] = "H"
words[35] = "I"
words[36] = "J"
words[37] = "K"
words[38] = "L"
words[39] = "M"
words[40] = "N"
words[41] = "O"
words[42] = "P"
words[43] = "Q"
words[44] = "R"
words[45] = "S"
words[46] = "T"
words[47] = "U"
words[48] = "V"
words[49] = "W"
words[50] = "X"
words[51] = "Y"
words[52] = "Z"
words[53] = "1"
words[54] = "2"
words[55] = "3"
words[56] = "4"
words[57] = "5"
words[58] = "6"
words[59] = "7"
words[60] = "8"
words[61] = "9"
words[62] = "0"

function BuildArray(size){
this.length = size
for (var i = 1; i <= size; i++){
this[i] = null}
return this
}

function PickRandomWord(frm) {
// Generate a random number between 1 and NumberOfWords
var rnd = Math.ceil(Math.random() * NumberOfWords)

// Display the word inside the text box
frm.WordBox.value = words[rnd]
}