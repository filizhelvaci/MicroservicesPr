package com.flz.service;

import com.flz.dto.request.DoLoginRequestDto;
import com.flz.dto.request.DoRegisterRequestDto;
import com.flz.model.Auth;
import com.flz.repository.IAuthRepository;
import com.flz.utils.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService extends ServiceManager<Auth,Long> {

    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository){
        super(repository);
        this.repository=repository;
    }
    public Auth doRegister(DoRegisterRequestDto dto) {

        // Burada önden gelen bilgiyi kaydederken kaydettiğimiz yerle karşılaştırmadık içinde bu değerler var mı yokmu? gibi
        // TODO Exception
        Auth auth=new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());
        // TODO password check
        auth.setPassword(dto.getPassword());
        auth.setCreateAt(System.currentTimeMillis());
        auth.setState(true);

        save(auth);

        return auth;
    }
    public String doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth=repository.findByUsernameAndPassword(dto.getUsername(),dto.getPassword());

        return auth.get().getId().toString();
    }


}
