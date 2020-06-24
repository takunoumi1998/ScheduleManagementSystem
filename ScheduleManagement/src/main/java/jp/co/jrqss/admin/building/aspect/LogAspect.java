package jp.co.jrqss.admin.building.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class LogAspect {
	/**
     * コントローラークラスのログ出力用アスペクト.
     */
    @Around("execution(* *..*.*BuildingDao*.*(..))")
    public Object startLog(ProceedingJoinPoint jp) throws Throwable {

        System.out.println("メソッド開始： " + jp.getSignature());

        try {
            // ポイント２：メソッド実行
            Object result = jp.proceed();

            System.out.println("メソッド終了： " + jp.getSignature());

            return result;

        } catch (Exception e) {
            System.out.println("メソッド異常終了： " + jp.getSignature());
            e.printStackTrace();
            throw e;
        }
    }

    /**
    * Daoクラスのログ出力用アスペクト.
    */
   @Around("execution(* *..*.*BuildingDao*.*(..))")
   public Object daoLog(ProceedingJoinPoint jp) throws Throwable {

       System.out.println("メソッド開始： " + jp.getSignature());

       try {

           Object result = jp.proceed();

           System.out.println("メソッド終了： " + jp.getSignature());

           return result;

       } catch (Exception e) {
           System.out.println("メソッド異常終了： " + jp.getSignature());
           e.printStackTrace();
           throw e;
       }
   }
}
