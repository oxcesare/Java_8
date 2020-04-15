/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapEnum;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Supaada-q214
 */
public enum UserType {

    ADMIN(true), MODERATOR(true), DEVELOPER(false);

    private final boolean editPermission;

    private UserType(boolean editPermission) {
        this.editPermission = editPermission;
    }
    
    
    Map<String, Boolean> userTypeEditPermission(){
        return Stream.of(UserType.values()).collect(
                (Collector<? super UserType, A, R>) Collectors.toMap
        (Enum::name,UserType::userTypeEditPermission));
    }

}
