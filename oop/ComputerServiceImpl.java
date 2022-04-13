package com.oop;

public class ComputerServiceImpl implements ComputerService {

    @Override
    public void display(Computer computer) throws ServiceException{
        if (computer == null) {
            throw new ServiceException("no computer");
        }
        if (!computer.isScreen()) {
            throw new ServiceException("����û��ʾ��");
        }
        System.out.println("display start");
        System.out.println(computer.display());
        System.out.println("display end");
    }

    @Override
    public void input(Computer computer) throws ServiceException{
        if (computer == null) {
            throw new ServiceException("no computer");
        }
        if (!computer.isKeyboard()) {
            throw new ServiceException("����û����");
        }
        System.out.println("input start");
        computer.input();
        System.out.println("input end");
    }
}

