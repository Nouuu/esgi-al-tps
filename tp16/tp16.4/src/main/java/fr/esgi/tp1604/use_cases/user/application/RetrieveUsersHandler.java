package fr.esgi.tp1604.use_cases.user.application;

import fr.esgi.tp1604.kernel.QueryHandler;
import fr.esgi.tp1604.use_cases.user.domain.User;
import fr.esgi.tp1604.use_cases.user.domain.UserRepository;

import java.util.List;

public class RetrieveUsersHandler implements QueryHandler<RetrieveUsers, List<User>> {

    private final UserRepository userRepository;

    public RetrieveUsersHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> handle(RetrieveUsers query) {
        return userRepository.findAll();
    }
}
