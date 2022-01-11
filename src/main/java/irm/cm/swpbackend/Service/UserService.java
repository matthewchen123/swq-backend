package irm.cm.swpbackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import irm.cm.swpbackend.Entity.User;
import irm.cm.swpbackend.Repository.UserRepository;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public boolean isExist(String username){
        User user = userRepository.findByUsername(username);
        return null!=user;
    }    

    public User get(String username,String password){
        return userRepository.getByUsernameAndPassword(username, password);
    }


    public List<User> findAllUser(){
        List<User> user = userRepository.findAll();
        return user;
    }    

    public User saveUser(User u){
        return userRepository.save(u);
    }

}
