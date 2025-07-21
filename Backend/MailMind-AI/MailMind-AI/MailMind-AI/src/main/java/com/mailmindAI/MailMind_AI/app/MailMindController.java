package com.mailmindAI.MailMind_AI.app;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class MailMindController {

    private final MailMindService emailGeneratorService;


    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody  EmailRequest emailRequest){
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
