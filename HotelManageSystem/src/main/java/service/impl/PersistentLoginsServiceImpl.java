package service.impl;


import domain.PersistentLogins;
import mapper.PersistentLoginsMapper;
import service.PersistentLoginsService;
import org.springframework.stereotype.Service;

/**
* @author adm
* @description 针对表【persistent_logins(persistent_logins表，用户实现记住我功能)】的数据库操作Service实现
* @createDate 2025-01-18 08:54:32
*/
@Service
public class PersistentLoginsServiceImpl extends ServiceImpl<PersistentLoginsMapper, PersistentLogins>
    implements PersistentLoginsService {

}




