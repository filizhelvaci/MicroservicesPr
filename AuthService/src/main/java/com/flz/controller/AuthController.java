package com.flz.controller;

import com.flz.constant.EndPoint;
import com.flz.dto.request.DoLoginRequestDto;
import com.flz.dto.request.DoRegisterRequestDto;
import com.flz.model.Auth;
import com.flz.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// http://localhost:9090/auth
@RestController
@RequestMapping("/auth")
public class AuthController {

 private final AuthService authService;

 public AuthController(AuthService authService){
   this.authService=authService;
 }

    // http://localhost:9090/auth/register
 @PostMapping(EndPoint.REGISTER)
  public ResponseEntity<Auth> doRegister(@RequestBody DoRegisterRequestDto dto)
  {
      System.out.println("DTO:"+dto);
      return ResponseEntity.ok(authService.doRegister(dto));
  }

    // http://localhost:9090/auth/login
  @PostMapping(EndPoint.LOGIN)
  public ResponseEntity<String> doLogin(@RequestBody DoLoginRequestDto dto){
      System.out.println("DTO:"+dto);
      return ResponseEntity.ok(authService.doLogin(dto));
  }


   public ResponseEntity< List<Auth> > dofindAll(){
       return ResponseEntity.ok(authService.findAll());
   }

    public ResponseEntity<String> getMessage(){
         return ResponseEntity.ok("Auth servisinden gelen mesaj");
    }

}
