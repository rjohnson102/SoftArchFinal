package edu.wctc.Parse;

public class ParseInt implements Parse{

    @Override
    /*Parses String to Integer*/
    public boolean parse(String option) {
        try{
            Integer.parseInt(option);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
