package oving2;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;

public class Person {

    String name;
    String email;
    Date birth;
    char gender;
    String[] countryCode = {"ad", "ae", "af", "ag", "ai", "al", "am", "ao", "aq", "ar", "as",
     "at", "au", "aw", "ax", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bl", "bm", 
     "bn", "bo", "bq", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", 
     "ci", "ck", "cl", "cm", "cn", "co", "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", 
     "dm", "do", "dz", "ec", "ee", "eg", "eh", "er", "es", "et", "fi", "fj", "fk", "fm", "fo", "fr", 
     "ga", "gb", "gd", "ge", "gf", "gg", "gh", "gi", "gl", "gm", "gn", "gp", "gq", "gr", "gs", "gt", 
     "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie", "il", "im", "in", "io", "iq", 
     "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", 
     "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", 
     "me", "mf", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mu", "mv", 
     "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu", "nz", 
     "om", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw", "py", "qa", 
     "re", "ro", "rs", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", 
     "sm", "sn", "so", "sr", "ss", "st", "sv", "sx", "sy", "sz", "tc", "td", "tf", "tg", "th", "tj", 
     "tk", "tl", "tm", "tn", "to", "tr", "tt", "tv", "tw", "tz", "ua", "ug", "um", "us", "uy", "uz", 
     "va", "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "ye", "yt", "za", "zm", "zw"};

  
    public void checkName(String name){
        
        String[] splitName = name.split("\\s+");
        // no name can be less than two characters
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException("The name is too short, it must be at least two characters");
        }
        // a name can only contain letters, spaces and hyphens
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (! (Character.isLetter(c) || c == ' ' || c == '-')) {
                throw new IllegalArgumentException("'" + c + "' is an illegal character, a name can only contain letters, space or hyphens");
            }
        }
    }


    public void setName(String name) {
        checkName(name);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void checkEmail(String email){


    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

   


    public void setBirthday(Date birth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu", Locale.UK).withResolverStyle(ResolverStyle.STRICT);
        try{
            formatter.parse(birth);
            this.birth = birth;
        }
        catch(Exception e) {
            throw new IllegalArgumentException("Enter a valid date");
        }

       
    }

    public Date getBirth() {
        return birth;
    }

    public void setGender(char gender) {
        if(gender == ' ' || !((gender == 'G') || (gender == 'M') || (gender == '\0'))){
            throw new IllegalArgumentException("Type in valid gender");
        }
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

     public static void main(String[] args) {
        Person p1 = new Person();
        p1.setGender('M');
        System.out.println(p1.getGender());
     }
}