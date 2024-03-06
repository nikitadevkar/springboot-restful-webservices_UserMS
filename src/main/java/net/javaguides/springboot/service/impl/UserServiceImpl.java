package net.javaguides.springboot.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.UserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
/*
    @Override
    public User createUser(User user) {
    return userRepository.save(user);
    }
*/
//find by id is optional type pass user  as type and optional use usr
    //get method return user object
    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }}
/*
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		
	}

   /// @Override
   // public User updateUser(User user) {
    //    User existingUser = userRepository.findById(user.getId()).get();
   //     existingUser.setFirstName(user.getFirstName());
  //      existingUser.setLastName(user.getLastName());
    //    existingUser.setEmail(user.getEmail());
      //  User updatedUser = userRepository.save(existingUser);
      //  return updatedUser;
}*/
