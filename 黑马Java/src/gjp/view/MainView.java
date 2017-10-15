package gjp.view;

import gjp.controller.ZhangWuController;
import gjp.domain.ZhangWu;
import java.util.List;
import java.util.Scanner;

public class MainView {
    private ZhangWuController controller = new ZhangWuController();
    private Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("---------------管家婆家庭记账软件---------------");
            System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
            System.out.print("请输入要操作的功能序号[1-5]: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    addZhangWu();
                    break;
                case 2:
                    editZhangWu();
                    break;
                case 3:
                    deleteZhangWu();
                    break;
                case 4:
                    selectZhangWu();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    private void deleteZhangWu() {
        selectAll();
        System.out.print("选择的是删除功能，请输入序号即可: ");
        int zwid = sc.nextInt();
        controller.deleteZhangWu(zwid);
        System.out.println("删除账务成功");
    }

    private void editZhangWu() {
        selectAll();
        System.out.println("选择的是编辑功能，请输入数据");
        System.out.print("请输入ID: ");
        int zwid = sc.nextInt();
        System.out.print("输入分类名称: ");
        String flname = sc.next();
        System.out.print("输入金额: ");
        double money = sc.nextDouble();
        System.out.print("输入账户: ");
        String zhanghu = sc.next();
        System.out.print("输入日期(格式XXXX-XX-XX): ");
        String createtime = sc.next();
        System.out.print("输入具体描述: ");
        String description = sc.next();
        ZhangWu zw = new ZhangWu(zwid, flname, money, zhanghu, createtime, description);
        controller.editZhangWu(zw);
        System.out.println("账务编辑成功");
    }

    private void addZhangWu() {
        System.out.println("选择的添加账务功能，请输入以下内容");
        System.out.print("输入分类名称: ");
        String flname = sc.next();
        System.out.print("输入金额: ");
        double money = sc.nextDouble();
        System.out.print("输入账户: ");
        String zhanghu = sc.next();
        System.out.print("输入日期(格式XXXX-XX-XX): ");
        String createtime = sc.next();
        System.out.print("输入具体描述: ");
        String description = sc.next();
        ZhangWu zw = new ZhangWu(0, flname, money, zhanghu, createtime, description);
        controller.addZhangWu(zw);
        System.out.println("恭喜添加账务成功");
    }

    private void selectZhangWu() {
        System.out.println("1. 查询所有    2. 条件查询");
        System.out.print("您的选择: ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                selectAll();
                break;
            case 2:
                select();
                break;
        }
    }

    private void select() {
        System.out.println("选择条件查询,输入日期格式XXXX-XX-XX");
        System.out.print("请输入开始日期: ");
        String startDate = sc.next();
        System.out.print("请输入结束日期: ");
        String endDate = sc.next();
        List<ZhangWu> list = controller.select(startDate, endDate);
        if (list.size() != 0) {
            print(list);
        } else {
            System.out.println("没有查询到数据");
        }
    }

    private void selectAll() {
        List<ZhangWu> list = controller.selectAll();
        if (list.size() != 0) {
            print(list);
        } else {
            System.out.println("没有查询到数据");
        }
    }

    private void print(List<ZhangWu> list) {
        System.out.println("ID\t\t类别\t\t账户\t\t金额\t\t时间\t\t说明");
        for (ZhangWu zw : list) {
            System.out.println(zw.getZwid() + "\t\t" + zw.getFlname() + "\t\t" + zw.getZhanghu() + "\t\t" +
                    zw.getMoney() + "\t\t" + zw.getCreatetime() + "\t" + zw.getDescription());
        }
    }
}
