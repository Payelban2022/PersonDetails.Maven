package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";

        // create a `counter`
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        int counter;
        int length = personArray.length;
//        System.out.println(personArray[1].getFirstName());
        int i=0;
        while (i<length){
            result=result+"\nMy first name is "+personArray[i].getFirstName();
            result=result+"\nMy last name is "+personArray[i].getLastName();
            i++;
        }
//        result="\nMy first name is "+personArray[1].getFirstName();

        System.out.println(result);
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        int length = personArray.length;
        for(int i = 0; i < length;i++){
            result=result+"\nMy first name is "+personArray[i].getFirstName();
            result=result+"\nMy last name is "+personArray[i].getLastName();
        }
        System.out.println(result);
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        for(Person person : personArray){
            result=result+"\nMy first name is "+person.getFirstName();
            result=result+"\nMy last name is "+person.getLastName();
        }
        System.out.println(result);
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }


}
