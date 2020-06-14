package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/14 18:12
 */
public class WangZheRole {
    // 接口作为成员变量
    private FaShuSkill faShuSkill;

    public FaShuSkill getFaShuSkill() {
        return faShuSkill;
    }

    public void setFaShuSkill(FaShuSkill faShuSkill) {
        this.faShuSkill = faShuSkill;
    }
    //  发动法术攻击
    public void faShuSkillAttack(){
        System.out.println("开始发动法术攻击");
        faShuSkill.faShuAttack();
        System.out.println("技能释放完毕");
    }

}
