package vn.unikcore.nextcrmads.common.interfaces;

public interface IFindService<T, R> {
    public T execute(R data);
}
