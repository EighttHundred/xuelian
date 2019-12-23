package test;

import org.junit.Test;

import ruanku.xuelian_requirement.model.*;
import ruanku.xuelian_requirement.common.enums.UserType;
import ruanku.xuelian_requirement.common.processors.*;

public class EnumTest
{
    @Test
    public void getName()
    {
        UserType type=UserType.ENTERPRISE;
        System.out.println(type.name());
    }
}