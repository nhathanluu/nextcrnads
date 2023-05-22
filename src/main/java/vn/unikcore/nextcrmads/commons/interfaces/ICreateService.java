package vn.unikcore.nextcrmads.commons.interfaces;

public interface ICreateService<T, R> {
    public T execute(R data);
}
