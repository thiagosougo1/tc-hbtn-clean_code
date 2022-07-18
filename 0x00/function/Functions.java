public class Functions {
    // Faça somente 1 coisa
    //A
    public void saveCash(Income income, Expense expense){
        inRepo.save(income);
        outRepo.save(expense);
    }

    //Somente 1 nível de abstração
    //B
    @PostMapping("/user")
    public User saveUser(User user){
        return userService.userRepository.save(user);
    }    

    // Arguments
    //B
    public void saveUser(String userName, User user, Date date, boolean isAdmin){}; 

    //  No side effects
    //A
    public User saveUser(User user){
      if(user.isAdmin){
      user.setRole(user);
    }
      return userRepository.save(user);
    }

    // Evite duplicados, extraindo para novos métodos
    //B
    public Environment getEnvironment(){
        return environmentService.getEnvironment(getVersion());
    }
    public Release getRelease(){
        return releaseService.getRelease(getVersion());
    }
    private String getVersion(){ 
        return versionService.getVersion();
    }

}
