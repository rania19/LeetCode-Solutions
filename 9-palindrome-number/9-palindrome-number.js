/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x<0){
        return false; 
    }
    let res = false; 
    let temp = x;
    //console.log("numb is"+numb);
    let rev= 0;
   
    while (x>0){
        rev = (rev*10) + (x% 10);
        x = parseInt(x/10);
        
        
    }
    return (rev == temp);
    
};