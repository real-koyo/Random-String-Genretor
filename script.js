function test(){
    let element = document.getElementById('rdst');
    
    // declaring all posiable alphabets and numbers both in capital and small letters
    aphanuro = ["a","A","b","B","c","C","d","D","e","E","f","F","g","G","h","H","i","I","j","J","k","K","l","L","m","M","n","N","o","O","p","P","q","Q","r","R","s","S","t","T","u","U","v","V","w","W","x","X","y","Y","z","Z","0","1","2","3","4","5","6","7","8","9"]
    
    app = aphanuro.length
    let password = "";
    let i = 0;
    let number = document.getElementById('length').value -1;

    //getting the random data and merging it as a single string
    while (i <= number){
        
        total = Math.round(Math.random() * (1) * (app - 2));
        final = aphanuro[total];
        password = final + password;
        i++;
    }
    element.innerHTML=password;
}