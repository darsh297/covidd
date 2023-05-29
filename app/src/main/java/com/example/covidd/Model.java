package com.example.covidd;
public class Model {
    private String name, total, death, cured, active, incAct, incDec, incRec;

    public Model(String name, String total, String death, String cured,
                 String active, String incAct, String incDec, String incRec)
    {
        this.name = name;
        this.total = total;
        this.death = death;
        this.cured = cured;
        this.active = active;
        this.incAct = incAct;
        this.incDec = incDec;
        this.incRec = incRec;
    }

    public String getIncAct()
    {
        return incAct;
    }

    public void setIncAct(String incAct)
    {
        this.incAct = incAct;
    }

    public String getIncDec()
    {
        return incDec;
    }

    public void setIncDec(String incDec)
    {
        this.incDec = incDec;
    }

    public String getIncRec()
    {
        return incRec;
    }

    public void setIncRec(String incRec)
    {
        this.incRec = incRec;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTotal()
    {
        return total;
    }

    public void setTotal(String total)
    {
        this.total = total;
    }

    public String getDeath()
    {
        return death;
    }

    public void setDeath(String death)
    {
        this.death = death;
    }

    public String getCured()
    {
        return cured;
    }

    public void setCured(String cured)
    {
        this.cured = cured;
    }

    public String getActive()
    {
        return active;
    }

    public void setActive(String active)
    {
        this.active = active;
    }
}
