package vn.unikcore.nextcrmads.commons.interfaces;

public interface IFindService<T, R> {
    public T execute(R data);
}
