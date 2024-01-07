package com.itheima.test;

import com.itheima.domain.Movie;

import java.util.Scanner;

public class MovieService {
    private Movie[] movies;
    private Scanner sc = new Scanner(System.in);

    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    // 电影管理系统，启动！！
    public void start() {
        lo:
        while (true) {
            System.out.println("----------欢迎进入电影管理系统----------");
            System.out.println("请输入您的选择：");
            System.out.println("1. 查询全部电影信息");
            System.out.println("2. 根据 id 查询电影信息");
            System.out.println("3. 退出");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    this.queryMovieInfos();
                    break;
                case 2:
                    this.queryMovieInfoById();
                    break;
                case 3:
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    private void queryMovieInfoById() {
        System.out.println("请输入电影 id：");
        int id = sc.nextInt();

        for (int i = 0; i < this.movies.length; i++) {
            Movie movie = movies[i];
            if (movie.getId() == id) {
                System.out.println(movie.getTitle() + "---" + movie.getScore());
                return;
            }
        }

        System.out.println("没有找到相关电影信息");
    }

    private void queryMovieInfos() {
        for (int i = 0; i < this.movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getTitle() + "---" + movie.getScore());
        }
    }
}
