package fr.esgi.tp1605.use_cases.user.exposition;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@SuppressWarnings("all")
@XmlRootElement
public class UsersDTO {
    public List<UserDTO> users;
}