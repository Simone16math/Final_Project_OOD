package Command;

import AbstractFactory.Menu;
import Command.*;

import java.util.List;

interface CommandOrder extends Command {
    List<Menu> getOrderList();
    void setOrderList(List<Menu> orderList);
}
