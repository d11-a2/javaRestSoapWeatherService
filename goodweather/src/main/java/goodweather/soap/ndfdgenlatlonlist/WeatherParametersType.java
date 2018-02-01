package goodweather.soap.ndfdgenlatlonlist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by viktor on 11.11.17.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"maxt",
                                 "mint",
                                 "temp",
                                 "dew",
                                 "appt",
                                 "pop12",
                                 "qpf",
                                 "snow",
                                 "sky",
                                 "rh",
                                 "wspd",
                                 "wdir",
                                 "wx",
                                 "icons",
                                 "waveh",
                                 "incw34",
                                 "incw50",
                                 "incw64",
                                 "cumw34",
                                 "cumw50",
                                 "cumw64",
                                 "wgust",
                                 "critfireo",
                                 "dryfireo",
                                 "conhazo",
                                 "ptornado",
                                 "phail",
                                 "ptstmwinds",
                                 "pxtornado",
                                 "pxhail",
                                 "pxtstmwinds",
                                 "ptotsvrtstm",
                                 "pxtotsvrtstm",
                                 "tmpabv14d",
                                 "tmpblw14d",
                                 "tmpabv30d",
                                 "tmpblw30d",
                                 "tmpabv90d",
                                 "tmpblw90d",
                                 "prcpabv14d",
                                 "prcpblw14d",
                                 "prcpabv30d",
                                 "prcpblw30d",
                                 "prcpabv90d",
                                 "prcpblw90d",
                                 "precipa_r",
                                 "sky_r",
                                 "td_r",
                                 "temp_r",
                                 "wdir_r",
                                 "wspd_r",
                                 "wwa",
                                 "iceaccum",
                                 "maxrh",
                                 "minrh"
})
public class WeatherParametersType {

  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean maxt;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean mint;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean temp;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean dew;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean appt;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean pop12;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean qpf;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean snow;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean sky;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean rh;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean wspd;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean wdir;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean wx;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean icons;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean waveh;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean incw34;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean incw50;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean incw64;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean cumw34;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean cumw50;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean cumw64;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean wgust;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean critfireo;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean dryfireo;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean conhazo;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean ptornado;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean phail;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean ptstmwinds;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean pxtornado;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean pxhail;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean pxtstmwinds;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean ptotsvrtstm;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean pxtotsvrtstm;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean tmpabv14d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean tmpblw14d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean tmpabv30d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean tmpblw30d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean tmpabv90d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean tmpblw90d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean prcpabv14d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean prcpblw14d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean prcpabv30d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean prcpblw30d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean prcpabv90d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean prcpblw90d;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean precipa_r;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean sky_r;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean td_r;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean temp_r;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean wdir_r;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean wspd_r;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean wwa;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean iceaccum;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean maxrh;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private boolean minrh;

  public WeatherParametersType() {
  }

  public WeatherParametersType(boolean maxt,
                               boolean mint,
                               boolean temp,
                               boolean dew,
                               boolean appt,
                               boolean pop12,
                               boolean qpf,
                               boolean snow,
                               boolean sky,
                               boolean rh,
                               boolean wspd,
                               boolean wdir,
                               boolean wx,
                               boolean icons,
                               boolean waveh,
                               boolean incw34,
                               boolean incw50,
                               boolean incw64,
                               boolean cumw34,
                               boolean cumw50,
                               boolean cumw64,
                               boolean wgust,
                               boolean critfireo,
                               boolean dryfireo,
                               boolean conhazo,
                               boolean ptornado,
                               boolean phail,
                               boolean ptstmwinds,
                               boolean pxtornado,
                               boolean pxhail,
                               boolean pxtstmwinds,
                               boolean ptotsvrtstm,
                               boolean pxtotsvrtstm,
                               boolean tmpabv14d,
                               boolean tmpblw14d,
                               boolean tmpabv30d,
                               boolean tmpblw30d,
                               boolean tmpabv90d,
                               boolean tmpblw90d,
                               boolean prcpabv14d,
                               boolean prcpblw14d,
                               boolean prcpabv30d,
                               boolean prcpblw30d,
                               boolean prcpabv90d,
                               boolean prcpblw90d,
                               boolean precipa_r,
                               boolean sky_r,
                               boolean td_r,
                               boolean temp_r,
                               boolean wdir_r,
                               boolean wspd_r,
                               boolean wwa,
                               boolean iceaccum,
                               boolean maxrh,
                               boolean minrh)
  {
    this.maxt = maxt;
    this.mint = mint;
    this.temp = temp;
    this.dew = dew;
    this.appt = appt;
    this.pop12 = pop12;
    this.qpf = qpf;
    this.snow = snow;
    this.sky = sky;
    this.rh = rh;
    this.wspd = wspd;
    this.wdir = wdir;
    this.wx = wx;
    this.icons = icons;
    this.waveh = waveh;
    this.incw34 = incw34;
    this.incw50 = incw50;
    this.incw64 = incw64;
    this.cumw34 = cumw34;
    this.cumw50 = cumw50;
    this.cumw64 = cumw64;
    this.wgust = wgust;
    this.critfireo = critfireo;
    this.dryfireo = dryfireo;
    this.conhazo = conhazo;
    this.ptornado = ptornado;
    this.phail = phail;
    this.ptstmwinds = ptstmwinds;
    this.pxtornado = pxtornado;
    this.pxhail = pxhail;
    this.pxtstmwinds = pxtstmwinds;
    this.ptotsvrtstm = ptotsvrtstm;
    this.pxtotsvrtstm = pxtotsvrtstm;
    this.tmpabv14d = tmpabv14d;
    this.tmpblw14d = tmpblw14d;
    this.tmpabv30d = tmpabv30d;
    this.tmpblw30d = tmpblw30d;
    this.tmpabv90d = tmpabv90d;
    this.tmpblw90d = tmpblw90d;
    this.prcpabv14d = prcpabv14d;
    this.prcpblw14d = prcpblw14d;
    this.prcpabv30d = prcpabv30d;
    this.prcpblw30d = prcpblw30d;
    this.prcpabv90d = prcpabv90d;
    this.prcpblw90d = prcpblw90d;
    this.precipa_r = precipa_r;
    this.sky_r = sky_r;
    this.td_r = td_r;
    this.temp_r = temp_r;
    this.wdir_r = wdir_r;
    this.wspd_r = wspd_r;
    this.wwa = wwa;
    this.iceaccum = iceaccum;
    this.maxrh = maxrh;
    this.minrh = minrh;
  }

  public boolean isMaxt() {
    return maxt;
  }

  public boolean isMint() {
    return mint;
  }

  public boolean isTemp() {
    return temp;
  }

  public boolean isDew() {
    return dew;
  }

  public boolean isAppt() {
    return appt;
  }

  public boolean isPop12() {
    return pop12;
  }

  public boolean isQpf() {
    return qpf;
  }

  public boolean isSnow() {
    return snow;
  }

  public boolean isSky() {
    return sky;
  }

  public boolean isRh() {
    return rh;
  }

  public boolean isWspd() {
    return wspd;
  }

  public boolean isWdir() {
    return wdir;
  }

  public boolean isWx() {
    return wx;
  }

  public boolean isIcons() {
    return icons;
  }

  public boolean isWaveh() {
    return waveh;
  }

  public boolean isIncw34() {
    return incw34;
  }

  public boolean isIncw50() {
    return incw50;
  }

  public boolean isIncw64() {
    return incw64;
  }

  public boolean isCumw34() {
    return cumw34;
  }

  public boolean isCumw50() {
    return cumw50;
  }

  public boolean isCumw64() {
    return cumw64;
  }

  public boolean isWgust() {
    return wgust;
  }

  public boolean isCritfireo() {
    return critfireo;
  }

  public boolean isDryfireo() {
    return dryfireo;
  }

  public boolean isConhazo() {
    return conhazo;
  }

  public boolean isPtornado() {
    return ptornado;
  }

  public boolean isPhail() {
    return phail;
  }

  public boolean isPtstmwinds() {
    return ptstmwinds;
  }

  public boolean isPxtornado() {
    return pxtornado;
  }

  public boolean isPxhail() {
    return pxhail;
  }

  public boolean isPxtstmwinds() {
    return pxtstmwinds;
  }

  public boolean isPtotsvrtstm() {
    return ptotsvrtstm;
  }

  public boolean isPxtotsvrtstm() {
    return pxtotsvrtstm;
  }

  public boolean isTmpabv14d() {
    return tmpabv14d;
  }

  public boolean isTmpblw14d() {
    return tmpblw14d;
  }

  public boolean isTmpabv30d() {
    return tmpabv30d;
  }

  public boolean isTmpblw30d() {
    return tmpblw30d;
  }

  public boolean isTmpabv90d() {
    return tmpabv90d;
  }

  public boolean isTmpblw90d() {
    return tmpblw90d;
  }

  public boolean isPrcpabv14d() {
    return prcpabv14d;
  }

  public boolean isPrcpblw14d() {
    return prcpblw14d;
  }

  public boolean isPrcpabv30d() {
    return prcpabv30d;
  }

  public boolean isPrcpblw30d() {
    return prcpblw30d;
  }

  public boolean isPrcpabv90d() {
    return prcpabv90d;
  }

  public boolean isPrcpblw90d() {
    return prcpblw90d;
  }

  public boolean isPrecipa_r() {
    return precipa_r;
  }

  public boolean isSky_r() {
    return sky_r;
  }

  public boolean isTd_r() {
    return td_r;
  }

  public boolean isTemp_r() {
    return temp_r;
  }

  public boolean isWdir_r() {
    return wdir_r;
  }

  public boolean isWspd_r() {
    return wspd_r;
  }

  public boolean isWwa() {
    return wwa;
  }

  public boolean isIceaccum() {
    return iceaccum;
  }

  public boolean isMaxrh() {
    return maxrh;
  }

  public boolean isMinrh() {
    return minrh;
  }

  public void setMaxt(boolean maxt) {
    this.maxt = maxt;
  }

  public void setMint(boolean mint) {
    this.mint = mint;
  }

  public void setTemp(boolean temp) {
    this.temp = temp;
  }

  public void setDew(boolean dew) {
    this.dew = dew;
  }

  public void setAppt(boolean appt) {
    this.appt = appt;
  }

  public void setPop12(boolean pop12) {
    this.pop12 = pop12;
  }

  public void setQpf(boolean qpf) {
    this.qpf = qpf;
  }

  public void setSnow(boolean snow) {
    this.snow = snow;
  }

  public void setSky(boolean sky) {
    this.sky = sky;
  }

  public void setRh(boolean rh) {
    this.rh = rh;
  }

  public void setWspd(boolean wspd) {
    this.wspd = wspd;
  }

  public void setWdir(boolean wdir) {
    this.wdir = wdir;
  }

  public void setWx(boolean wx) {
    this.wx = wx;
  }

  public void setIcons(boolean icons) {
    this.icons = icons;
  }

  public void setWaveh(boolean waveh) {
    this.waveh = waveh;
  }

  public void setIncw34(boolean incw34) {
    this.incw34 = incw34;
  }

  public void setIncw50(boolean incw50) {
    this.incw50 = incw50;
  }

  public void setIncw64(boolean incw64) {
    this.incw64 = incw64;
  }

  public void setCumw34(boolean cumw34) {
    this.cumw34 = cumw34;
  }

  public void setCumw50(boolean cumw50) {
    this.cumw50 = cumw50;
  }

  public void setCumw64(boolean cumw64) {
    this.cumw64 = cumw64;
  }

  public void setWgust(boolean wgust) {
    this.wgust = wgust;
  }

  public void setCritfireo(boolean critfireo) {
    this.critfireo = critfireo;
  }

  public void setDryfireo(boolean dryfireo) {
    this.dryfireo = dryfireo;
  }

  public void setConhazo(boolean conhazo) {
    this.conhazo = conhazo;
  }

  public void setPtornado(boolean ptornado) {
    this.ptornado = ptornado;
  }

  public void setPhail(boolean phail) {
    this.phail = phail;
  }

  public void setPtstmwinds(boolean ptstmwinds) {
    this.ptstmwinds = ptstmwinds;
  }

  public void setPxtornado(boolean pxtornado) {
    this.pxtornado = pxtornado;
  }

  public void setPxhail(boolean pxhail) {
    this.pxhail = pxhail;
  }

  public void setPxtstmwinds(boolean pxtstmwinds) {
    this.pxtstmwinds = pxtstmwinds;
  }

  public void setPtotsvrtstm(boolean ptotsvrtstm) {
    this.ptotsvrtstm = ptotsvrtstm;
  }

  public void setPxtotsvrtstm(boolean pxtotsvrtstm) {
    this.pxtotsvrtstm = pxtotsvrtstm;
  }

  public void setTmpabv14d(boolean tmpabv14d) {
    this.tmpabv14d = tmpabv14d;
  }

  public void setTmpblw14d(boolean tmpblw14d) {
    this.tmpblw14d = tmpblw14d;
  }

  public void setTmpabv30d(boolean tmpabv30d) {
    this.tmpabv30d = tmpabv30d;
  }

  public void setTmpblw30d(boolean tmpblw30d) {
    this.tmpblw30d = tmpblw30d;
  }

  public void setTmpabv90d(boolean tmpabv90d) {
    this.tmpabv90d = tmpabv90d;
  }

  public void setTmpblw90d(boolean tmpblw90d) {
    this.tmpblw90d = tmpblw90d;
  }

  public void setPrcpabv14d(boolean prcpabv14d) {
    this.prcpabv14d = prcpabv14d;
  }

  public void setPrcpblw14d(boolean prcpblw14d) {
    this.prcpblw14d = prcpblw14d;
  }

  public void setPrcpabv30d(boolean prcpabv30d) {
    this.prcpabv30d = prcpabv30d;
  }

  public void setPrcpblw30d(boolean prcpblw30d) {
    this.prcpblw30d = prcpblw30d;
  }

  public void setPrcpabv90d(boolean prcpabv90d) {
    this.prcpabv90d = prcpabv90d;
  }

  public void setPrcpblw90d(boolean prcpblw90d) {
    this.prcpblw90d = prcpblw90d;
  }

  public void setPrecipa_r(boolean precipa_r) {
    this.precipa_r = precipa_r;
  }

  public void setSky_r(boolean sky_r) {
    this.sky_r = sky_r;
  }

  public void setTd_r(boolean td_r) {
    this.td_r = td_r;
  }

  public void setTemp_r(boolean temp_r) {
    this.temp_r = temp_r;
  }

  public void setWdir_r(boolean wdir_r) {
    this.wdir_r = wdir_r;
  }

  public void setWspd_r(boolean wspd_r) {
    this.wspd_r = wspd_r;
  }

  public void setWwa(boolean wwa) {
    this.wwa = wwa;
  }

  public void setIceaccum(boolean iceaccum) {
    this.iceaccum = iceaccum;
  }

  public void setMaxrh(boolean maxrh) {
    this.maxrh = maxrh;
  }

  public void setMinrh(boolean minrh) {
    this.minrh = minrh;
  }

  @Override
  public String toString() {
    return "WeatherParametersType{" +
           "maxt=" + maxt +
           ", mint=" + mint +
           ", temp=" + temp +
           ", dew=" + dew +
           ", appt=" + appt +
           ", pop12=" + pop12 +
           ", qpf=" + qpf +
           ", snow=" + snow +
           ", sky=" + sky +
           ", rh=" + rh +
           ", wspd=" + wspd +
           ", wdir=" + wdir +
           ", wx=" + wx +
           ", icons=" + icons +
           ", waveh=" + waveh +
           ", incw34=" + incw34 +
           ", incw50=" + incw50 +
           ", incw64=" + incw64 +
           ", cumw34=" + cumw34 +
           ", cumw50=" + cumw50 +
           ", cumw64=" + cumw64 +
           ", wgust=" + wgust +
           ", critfireo=" + critfireo +
           ", dryfireo=" + dryfireo +
           ", conhazo=" + conhazo +
           ", ptornado=" + ptornado +
           ", phail=" + phail +
           ", ptstmwinds=" + ptstmwinds +
           ", pxtornado=" + pxtornado +
           ", pxhail=" + pxhail +
           ", pxtstmwinds=" + pxtstmwinds +
           ", ptotsvrtstm=" + ptotsvrtstm +
           ", pxtotsvrtstm=" + pxtotsvrtstm +
           ", tmpabv14d=" + tmpabv14d +
           ", tmpblw14d=" + tmpblw14d +
           ", tmpabv30d=" + tmpabv30d +
           ", tmpblw30d=" + tmpblw30d +
           ", tmpabv90d=" + tmpabv90d +
           ", tmpblw90d=" + tmpblw90d +
           ", prcpabv14d=" + prcpabv14d +
           ", prcpblw14d=" + prcpblw14d +
           ", prcpabv30d=" + prcpabv30d +
           ", prcpblw30d=" + prcpblw30d +
           ", prcpabv90d=" + prcpabv90d +
           ", prcpblw90d=" + prcpblw90d +
           ", precipa_r=" + precipa_r +
           ", sky_r=" + sky_r +
           ", td_r=" + td_r +
           ", temp_r=" + temp_r +
           ", wdir_r=" + wdir_r +
           ", wspd_r=" + wspd_r +
           ", wwa=" + wwa +
           ", iceaccum=" + iceaccum +
           ", maxrh=" + maxrh +
           ", minrh=" + minrh +
           '}';
  }
}