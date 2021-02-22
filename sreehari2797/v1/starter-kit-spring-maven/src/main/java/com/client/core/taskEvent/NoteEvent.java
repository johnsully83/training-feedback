package com.client.core;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import com.client.core.security.tools.RC4;

import java.util.Optional

@Service
public class SetLastCalled extends NoteEventTask {
    private final Logger log = Logger.getLogger(getClass());

    @Override
    public void handle(NoteEventTraverser traverser) {
        if(traverser.getEventType() == EventType.INSERTED || traverser.getEventType() == EventType.UPDATED) {
            
            var note = traverser.getScheduledTaskHelper.getEntity();

            String[] act = {"BD Call","Sourcing Call","Recruiting Call","Prescreen","Cold Call","Prospect Call","Client Call","Outbound Call","Inbound Call"};

            for(int i=0;i<act.length;i++)
            {
                if(note.action.Equals(act[i]))
                {
                    var currentDate = new Date();
                   
                    API.appBridge.httpGET('/entity/ClientContact/${API.globals.userID}').then(response => {
                        
                          API.setValue('customDate1',currentDate);
                        
                }
            }
        }
    }
    
}