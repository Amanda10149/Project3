package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class User extends Model {
        @Id 
        private String email;

        @Constraints.Required
        private String role;

        @Constraints.Required
        private String name;

        @Constraints.Required
        private String password;

        // Default constructor
        public User() {      
        }

        //user unique id 
        public static Finder<String, User> find = new Finder<String, User>(User.class);

        //find users in db
        public static List<User> findAll(){
            return User.find.all();
        }

        //auth usern pass
        //returns if found
        public static User authenticate(String email, String password){
            return find.query().where().eq("email", email).eq("password", password).findUnique();
        }
}